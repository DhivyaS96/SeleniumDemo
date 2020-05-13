package demo.oops;

 class Briyani extends Food {

	@Override
	public void prepare() {
		System.out.println("Briyani prepared");
		System.out.println("Briyani ready");
	}
		
}
class Friedrice extends Food{
		String salt;
		public Friedrice(String salt){
			this.salt= salt;
		}
		@Override
		public void prepare() {
			System.out.println("Friedrice preapred");
			
		}
}
 class Cheesecake extends Food{
	 String cheese;
	 public Cheesecake(String cheese) {
		 this.cheese= cheese;
	 }
	 public void prepare() {
		 System.out.println("Cheescake prepared");
	 }
 }
