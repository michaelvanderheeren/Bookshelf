package bookshelf.apis.libis.parameters;

import bookshelf.IParameter;

public enum Library implements IParameter {
	All (""),
	ACV_CSC ("ACV OR EACV"),
	Abdij_van_Park ("GPAR"),
	Academia_Belgica ("ACBE OR EACB"),
	Architectuur_St_Lucas_Brussel ("SLUCB OR EWNK"),
	Augustijns_Historisch_Instit ("GOSA"),
	Belgisch_Parlement ("BPB OR EBPB"),
	Belgisch_Parlement_Archief ("ARCH OR EBPB"),
	Boerenbond_Infodoc ("BB OR EBBO"),
	Centr_Agrarische_Geschiedenis ("CAG"),
	De_Nayer_Instituut ("DNA OR EDNA"),
	Don_Boscobibliotheek ("GSDB"),
	FARO ("VCV OR EVCV"),
	FOD_PO_OFO_SDC ("TIFA OR EPEO"),
	Fonds_voor_de_beroepsziekten ("FBZ"),
	Groot_Seminarie_Brugge ("GGSB"),
	Groot_Seminarie_Gent ("GBSG"),
	Groot_Seminarie_Rolduc ("GROL"),
	HUBrussel_campus_Nieuwland ("HUBNL OR EKUB OR EFREE"),
	HUBrussel_campus_Parnas ("HUBPD OR EKUB OR EFREE"),
	HUBrussel_Centrale_Bibliotheek ("HUB OR EKUB OR EFREE"),
	Hogeschool_Sint_Lukas_Brussel ("LUKAS OR EWNK"),
	IMEC ("IMEC OR EIMC"),
	Infotheek_FOD_Financi�n ("FINBI OR EFIN"),
	Jezu�eten_Heverlee ("GBSJ"),
	KADOC ("KADOC OR EKAD OR EFREE"),
	KATHO_Campus_Kortrijk ("KAKOR OR EKAT OR EFREE"),
	KATHO_Campus_Roeselare ("KAROE OR EKAT OR EFREE"),
	KATHO_Campus_Tielt ("KATIE OR EKAT OR EFREE"),
	KATHO_Campus_Torhout ("KATOR OR EKAT OR EFREE"),
	KBC_Bank_Verzekering ("KBC OR EKBC OR EFREE"),
	KBIN_Inst_voor_Natuurwet ("RBINS OR EBINS"),
	KHBO_Campus_Brugge ("KHCA OR EHBO OR EFREE"),
	KHBO_Campus_Oostende ("KHCO OR EHBO OR EFREE"),
	KHK_Campus_Turnhout ("KHKT OR EKHK OR EFREE"),
	KHLim_GEZ_en_SAW ("LIGS OR ELIM OR EFREE"),
	KHLim_HB_en_IWT ("LIHBI OR ELIM OR EFREE"),
	KHLim_LER_Secund_ond ("LILED OR ELIM OR EFREE"),
	KHLim_LER_kleuter_en_lager_ond ("LILEH OR ELIM OR EFREE"),
	KHLim_Media_Design_Academie ("LIMDA OR ELIM OR EFREE"),
	KULeuven_AVNet ("BAVD OR EKUL OR EFREE"),
	KULeuven_Belgische_schoolboek ("BSCH OR EKUL OR EFREE"),
	KULeuven_Biomed_Ethiek_Recht ("GBER OR EKUL OR EFREE"),
	KULeuven_Biomedische_Bib ("MGAS OR EKUL OR EFREE"),
	KULeuven_Campus_Kortrijk ("BIBK OR EKUL OR EFREE"),
	KULeuven_Campusbibl_Arenberg ("WBIB OR EKUL OR EFREE"),
	KULeuven_Centrale_Bibliotheek ("BIBC OR EKUL OR EFREE"),
	KULeuven_Econ_en_bedrijfswet ("ETEW OR EKUL OR EFREE"),
	KULeuven_Hoger_Inst_Wijsbeg ("FBIB OR EKUL OR EFREE"),
	KULeuven_Letteren ("LBIB OR EKUL OR EFREE"),
	KULeuven_MATRIX ("LMAT OR EKUL OR EFREE"),
	KULeuven_Maurits_Sabbebib ("GBIB OR EKUL OR EFREE"),
	KULeuven_Psych_Pedag_Wet ("PBIB OR EKUL OR EFREE"),
	KULeuven_Rechtsgeleerdheid ("RBIB OR EKUL OR EFREE"),
	KULeuven_Sociale_Wet ("SBIB OR EKUL OR EFREE"),
	KULeuven_Sportimonium ("ARDO OR EKUL OR EFREE"),
	KULeuven_Universiteitsarchief ("BUAR OR EKUL OR EFREE"),
	KaHo_SL_Campus_Aalst ("KHAAL OR EKAH OR EFREE"),
	KaHo_SL_Campus_Gent ("KHGEN OR EKAH OR EFREE"),
	KaHo_SL_Campus_Sint_Niklaas ("KHSTN OR EKAH OR EFREE"),
	Karmelieten_Brugge ("GOCB"),
	Kath_Hogeschool_Mechelen ("KHM OR EKHM OR EFREE"),
	Kon_Musea_Kunst_Geschiedenis ("KMMR OR EMKG"),
	Kon_Museum_voor_Midden_Afrika ("RMCA OR ERMA"),
	Lemmensinstituut ("LEMM OR EWNK"),
	Lessius_Handelshogeschool ("HHA OR ELES OR EFREE"),
	Lessius_Psychologie_Logopedie ("KVHB OR ELES OR EFREE"),
	Lessius_Toegepaste_Taalkunde ("KVHA OR ELES OR EFREE"),
	Liberaal_Archief ("LIBAR OR ELIB"),
	Montfortaanse_Mariale_Bibl ("GMML"),
	Montfortbibliotheek ("GSMM"),
	NBB_CBFA ("NBCFA OR ENBB"),
	NBB_Juridische_dienst ("NBJUR OR ENBB"),
	NBB_Wetenschappelijke_bib ("NBWBS OR ENBB"),
	SERV_documentatiecentrum ("SERV OR ESRV OR EFREE"),
	Scheut_Memorial_Library ("BSML"),
	St_Lucas_Arch_en_Kunst_Gent ("SLUCG OR EWNK"),
	VDIC_BIOETH ("BIOET OR EVES"),
	VDIC_CODA_CERVA ("CODA OR EVES"),
	VDIC_FAGG_AFSCA ("FAGG OR EVES"),
	VDIC_VES ("VES OR EVES"),
	VDIC_WIV_ISP ("WIV OR EVES"),
	Vlaams_Omroeporkest_Kamerkoor ("LVOK"),
	Vlaams_Parlement ("VLP OR EVLP OR EFREE");
	
    private final String value;
    
    Library(String value) {
        this.value = value;
    }

    public String getName() { return "request_filter_5"; }
    public String getValue()  { return this.value; }
    public String toString() { return getName()+"="+getValue(); }
}