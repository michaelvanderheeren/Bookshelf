package com.google.books.unofficial.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import bookshelf.api.AbstractBook;
import bookshelf.api.ISBN;

import net.htmlparser.jericho.Config;
import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.LoggerProvider;
import net.htmlparser.jericho.Segment;
import net.htmlparser.jericho.Source;

/**
 * Class which represents the Google Book collection.
 */
public class Collection {
	private final String feed = "http://books.google.com/books?rview=1&hl=en";
	private CollectionCache<String,Book> cache;
	
	/**
	 * Create a new instance of the Collection.
	 * @post	The cache of the collection is set to a new instance of the
	 * 			CollectionCache class with it's default cache limit.
	 */
	public Collection() {
		this.cache = new CollectionCache<String,Book>();
	}
	
	/**
	 * Create a new instance of the Collection.
	 * @param 	cacheLimit
	 * 			The amount of books to keep in the cache of the collection
	 * 			before discarding the oldest retrieval.
	 * @post	The cache of the collection is set to a new instance of the
	 * 			CollectionCache class with the given <cacheLimit> value as
	 * 			it's cache limit.
	 */
	public Collection(int cacheLimit) {
		this.cache = new CollectionCache<String,Book>(cacheLimit);
	}
	
	/**
	 * Retrieve books from the collection.
	 * @param 	query
	 * 			The query which is used to find books in the collection.
	 * @return	The books resulting from the execution of the query.
	 * @throws 	IOException
	 * @TODO	Remove IOException and add InvalidQueryException
	 */
	public ArrayList<Book> getBooks(String query) throws IOException {
		query = query.replaceAll(" ", "+");
		ArrayList<Book> result = new ArrayList<Book>();
		
		URL feedUrl = new URL(feed + "&q=" + query);
		Config.LoggerProvider=LoggerProvider.DISABLED;
		HttpURLConnection feedCon = (HttpURLConnection) feedUrl.openConnection(); 
		feedCon.addRequestProperty("User-Agent", "Safari/5.0");
		
		Source source=new Source(feedCon);
		
		List<Element> elements = source.getAllElementsByClass("annotated_thumbnail");
		
		for (Element e : elements) {
			Segment content = e.getContent();
			List<Element> urls = content.getAllElements(HTMLElementName.A);
			
			if (urls.size() > 0) {
				String url = urls.get(0).getAttributeValue("href");
				int beginId = url.indexOf("id=")+3;
				int endId = beginId+url.substring(beginId).indexOf("&");
				
				if (endId < 0)
					endId = url.length()-1;
				
				String id = url.substring(beginId,endId);
				Book book;
				
				if (cache.containsKey(id))
					book = cache.get(id);
				else {
					book = new Book("http://books.google.com/books?id=" + id);
					cache.put(id, book);
				}
				
				result.add(book);
			}
		}
		
		return result;
	}
	
	/**
	 * 
	 * @param query
	 * @param sYear
	 * @param eYear
	 * @return
	 * @throws IOException
	 */
	public ArrayList<Book> getBooks(String query, int sYear, int eYear) throws IOException {
		return getBooks(query+"+date:"+sYear+"-"+eYear);
	}
	
	/**
	 * 
	 * @param book
	 * @return
	 * @throws IOException
	 */
	public ArrayList<Book> getRelatedBooks(AbstractBook book) throws IOException {
		return getBooks("related:ISBN"+book.getISBN());
	}
	
	/**
	 * 
	 * @param isbn
	 * @return
	 * @throws IOException
	 */
	public AbstractBook getBook(ISBN isbn) throws IOException {
		return new Book(isbn);
	}
}
