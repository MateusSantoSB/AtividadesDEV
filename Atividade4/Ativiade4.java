public class Main
{
	public static void main(String[] args) {
	
	
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        double fatTotal = sp + rj + mg + es + outros;
        
        double percentSP = (sp / fatTotal) * 100;
        double percentRJ = (rj / fatTotal) * 100;
        double percentMG = (mg / fatTotal) * 100;
        double percentES = (es / fatTotal) * 100;
        double percentOutros = (outros / fatTotal) * 100;
        
        System.out.println("% de SP:"+ percentSP);
        System.out.println("% do RJ: "+ percentRJ);
        System.out.println("% de MG: "+ percentMG);
        System.out.println("% do ES: "+ percentES);
        System.out.println("% dos Outros: "+ percentOutros);
	
	}
}
