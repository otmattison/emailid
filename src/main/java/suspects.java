
public class suspects {
	
	String[] ray1;
	
	int nextIndex = 0;
	int arraySize = 0;
	
	public suspects(int size) {
		this.arraySize = size;
		this.ray1 = new String[size];
		
		
	}
	
	public void addSusspect(String subject) {
		this.ray1[this.nextIndex] = subject;
		this.nextIndex++;
		if(this.nextIndex >= this.arraySize){
			this.nextIndex = 0;
		}
	}
		public void printSuspects() {
			for (int i = 0; i < this.ray1.length; i++) {
				System.out.println(this.ray1[i]);
			}
	}
		public boolean foundMatch(String input) {
			for (int i = 0; i < this.ray1.length; i++) {
				if (null == this.ray1[i]) {
					continue;
				}
				if (this.ray1[i].equals(input)) {
					return true;
				}
			}
			return false;
		}
		
}
		
