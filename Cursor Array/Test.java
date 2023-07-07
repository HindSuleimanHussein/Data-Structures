package cursorArray;

public class Test {

	public static void main(String[] args) {
		CArray<String> cursorArray= new CArray<>(10);
		int passList=cursorArray.createList();
		cursorArray.insertAtLast("Amr", passList);
		cursorArray.insertAtLast("Aseel", passList);
		cursorArray.insertAtLast("Hind", passList);
		cursorArray.insertAtLast("Okay", passList);
		cursorArray.insertAtLast("UI", passList);
		cursorArray.traversList(passList);

		System.out.println(cursorArray.find("Hind", passList));


	}

}
