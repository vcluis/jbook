public enum EnumBook{
    JHTP("JAVA HOW TO PROGRAM", "2015"),
    CHTP("C HOW TO PROGRAM", "2013"),
    IW3HTP("INTERNET & WORD WIDE WEB HOW TO PROGRAM", "2012"),
    CPPHTP("C++ HOW TO PROGRAM", "2014"),
    VBHTP("VISUAL BASIC HOW TO PROGRAM", "2014"),
    CSHARPHTP("VISUAL C# HOW TO PROGRAM", "2014");
    // Last enum need to be closed with ;

    private final String title;
    private final String yearCopyright;

    EnumBook(String title, String yearCopyright){
        this.title = title;
        this.yearCopyright = yearCopyright;
    }

    public String getTitle(){return title;}
    public String getYearCopyright(){return yearCopyright;}
} 
