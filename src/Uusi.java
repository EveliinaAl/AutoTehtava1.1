public class Uusi {

	public static void main(String[] args) {
		Auto car = new Auto();
		auto2 car2 = new auto2();
		
		
		car.jarruta();
		car.kiihdyta();
		car.naytaTiedot();
		car.tankkaa();
		
		Auto auto1 = new Auto();

		auto1.merkki="Nissan";
		auto1.malli="Nisu";
		auto1.bensanMaara=5;
		
		
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();
		
		}
		}

		class Auto
		{
			public String merkki;
			public String malli;
			public int bensanMaara;
			public int tankkaa;

		public Auto()
		{
			merkki="Volvo";
			malli="V70";
			bensanMaara=5;
			tankkaa=10;
		}
		

		public Auto(String merkki, String malli, int bensanMaara, int tankkaa)
		{
			this.merkki=merkki;
			this.malli=malli;
			this.bensanMaara=bensanMaara;
			this.tankkaa=tankkaa;
		}

		public void jarruta()
		{
			System.out.println("Auto jarruttaa");
		}

		public void kiihdyta()
		{
			
			if (bensanMaara > 0)
			bensanMaara=bensanMaara-1;
			System.out.println("Auto kiihtyy");
		}

		public void naytaTiedot()
		{
			System.out.println("Merkki: " + merkki);
			System.out.println("Malli: " + malli);
			System.out.println("Bensa: " + bensanMaara);
			System.out.println("toinen commit");
		}
		public void tankkaa() 
		{
			System.out.println("Tankissa bensaa: " + bensanMaara);
			System.out.println("Tankkaus: " + tankkaa);
			System.out.println("Tankissa bensaa tankkauksen jälkeen: " + (tankkaa + bensanMaara));
		}
		
		
		}
		class auto2
		{
			public String merkki;
			public String malli;
			public int bensanMaara;
			public int tankkaa;
			
			public auto2()
			
			{
				merkki="BMW";
				malli="X4";
				bensanMaara=10;
				tankkaa=10;
			}
			
			public void Auto2(String merkki, String malli, int bensanMaara, int tankkaa)
			{
				this.merkki=merkki;
				this.malli=malli;
				this.bensanMaara=bensanMaara;
				this.tankkaa=tankkaa;
		}
			
		
	}


