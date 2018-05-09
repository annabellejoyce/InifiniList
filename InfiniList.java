import java.util.ArrayList;

public class InfiniList extends Thread {
	
	//instantiate arrayList of String types
	static ArrayList<String> infiniList = new ArrayList<String>();

	public void run() {
		// while loop to run indefinitely
		while (true) {
			//synchronized block to lock infiniList
			synchronized (infiniList) {
				// integer that gets the last element in the list
				int i = infiniList.size() - 1;

				// if else block
				//if list is empty or it ends with "infinite"
				if (infiniList.isEmpty() || infiniList.get(i) == "infinite") {
					//add "This"
					infiniList.add("This");
					//print the last element
					System.out.println(infiniList.get(i));
				} else if (infiniList.get(i) == "This") {
					infiniList.add("is");
					System.out.println(infiniList.get(i));
				} else {
					infiniList.add("infinite");
					System.out.println(infiniList.get(i));
				}

			}
		}
	}

	// main method
	public static void main(String[] args) {
		// create three threads
		for (int i = 1; i <= 3; i++) {
			InfiniList thread = new InfiniList();
			thread.start();
		}
	}
}
