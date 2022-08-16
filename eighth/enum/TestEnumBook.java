import java.util.EnumSet;

public class TestEnumBook{
    public static void main(String[] args){
        System.out.println("All books:");
        for(EnumBook book: EnumBook.values())
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getYearCopyright());
        System.out.println("Show constants (in range):");
        for(EnumBook book: EnumSet.range(EnumBook.JHTP, EnumBook.CPPHTP))
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getYearCopyright());
    }
}
