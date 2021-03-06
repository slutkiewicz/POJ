package _03Dziedziczenie.doc;

/** 
 * Klasa tastuj�ca sortowanie element�w
 *   @author 
 *  {@link http://julia.univ.gda.pl/~mattb/ Tomasz Borzyszkowski}
 *   @version 1.0    
 */
public class SortTest{
    /** 
     * Metoda demonstruj�ca sortowanie 20 element�w typu 
     * @see ElemInt
     * @param args nieu�ywane
     * @return nic
     */
    public static void main(String args[]) {
	Sortuj srt = new Sortuj(20);
	// wk�adamy 20 element�w	
	srt.dodajNa((new ElemInt(91)), 0);
	srt.dodajNa((new ElemInt(22)), 1);
	srt.dodajNa((new ElemInt( 4)), 2);
	srt.dodajNa((new ElemInt(67)), 3);
	srt.dodajNa((new ElemInt(11)), 4);
	srt.dodajNa((new ElemInt( 1)), 5);
	srt.dodajNa((new ElemInt(46)), 6);
	srt.dodajNa((new ElemInt(13)), 7);
	srt.dodajNa((new ElemInt(77)), 8);
	srt.dodajNa((new ElemInt(33)), 9);
	srt.dodajNa((new ElemInt(96)),10);
	srt.dodajNa((new ElemInt(28)),11);
	srt.dodajNa((new ElemInt( 7)),12);
	srt.dodajNa((new ElemInt(61)),13);
	srt.dodajNa((new ElemInt(18)),14);
	srt.dodajNa((new ElemInt( 2)),15);
	srt.dodajNa((new ElemInt(41)),16);
	srt.dodajNa((new ElemInt(12)),17);
	srt.dodajNa((new ElemInt(71)),18);
	srt.dodajNa((new ElemInt(39)),19);
	// wypisujemy elementy przez sortowaniem
	System.out.println(srt.toString());
	srt.sortuj(); // teraz sortujemy
	// wypisujemy posortowane
	System.out.println( srt.toString() );
    }
}
