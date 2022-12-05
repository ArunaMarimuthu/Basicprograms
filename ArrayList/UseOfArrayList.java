package example.arraylist;
import java.util.*;
import example.inheritance.*;
import example.UnexpectedAction;
public class UseOfArrayList{
	
	Scanner scan=new Scanner(System.in);

	public int getSize(ArrayList<String> list) throws UnexpectedAction{
		
		
		if(list!=null){
			return list.size();
		}
		else{	
			throw new UnexpectedAction("List can't be null");
		}

	}


	public ArrayList<String> append(ArrayList<String> list) throws UnexpectedAction{

		if(list!=null){
			System.out.println("Enter the no of Strings you want to Append");	
			int num=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Strings to Append");
			for(int i=0;i<num;i++){

				list.add(scan.nextLine());
			}
			return list;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}
		
	}
	
	public boolean addCustomObjects(ArrayList<Object> list,int input) throws UnexpectedAction{
		
		if(list!=null){
			System.out.println("Enter the no of objects you want to add");
			int times=scan.nextInt();
		
			for(int i=0;i<times;i++){
				if(input==1){
					list.add(new Swift());
				}
				else if(input==2){
					list.add(new Car());
				}
				else{
					
					return false;
				}
			}
			return true;
		}
		else{
			throw new UnexpectedAction("list can't be null");		
		}

			
	}	

	public void addDifferentObjects(ArrayList<Object> list) throws UnexpectedAction{

		if(list!=null){
			System.out.println("Enter the elements of Arraylist :");
			System.out.println("Enter a integer :");
			
			list.add(scan.nextInt());
		
			System.out.println("Enter a String :");
			scan.nextLine();
			list.add(scan.nextLine());
		
			System.out.println("1=>Add Swift Object\n2=>Add Car object");
			int input=scan.nextInt();
			if(input==1){
				list.add(new Swift());
			}
			else if(input==2){
				list.add(new Car());
			}
			else{
				System.out.println("Enter a valid input");
			}
		}
		else{
			throw new UnexpectedAction("list can't be null");		
		}

	}

	public int getIndex(ArrayList<String> list,String toFind) throws UnexpectedAction{

			if(list!=null){
				return list.indexOf(toFind);
			}
			else{
			
				throw new UnexpectedAction("List can't be null");
			}	

	}

	public void usingIterator(ArrayList<String> list) throws UnexpectedAction{
	
		if(list!=null){
				
			Iterator iterate=list.iterator();
			System.out.println("Using Iterator");
			while(iterate.hasNext()){
				System.out.println(iterate.next());
			}
			System.out.println("Using for each loop");
			for(String item:list)
			{
				System.out.println(item);
			}

		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}
	}

	public String getElement(ArrayList<String> list,int index) throws UnexpectedAction{

		if(list!=null){

			if(index<list.size()){
				return list.get(index);
			}
			else{
				return "Enter a valid index";
			}

		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}	
		
	}

	public int getLastIndex(ArrayList<String> list,String toFind) throws UnexpectedAction{

		if(list!=null){
			int lastIndex=list.lastIndexOf(toFind);
			return lastIndex;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		
		}
		
	}

	public boolean insertAt(ArrayList<String> list,String toInsert,int index) throws UnexpectedAction{
		
		if(list!=null){
			if(index<list.size()){
				list.add(index,toInsert);
				return true;
			}
			return false;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}		
		

	}
	
	public List<String> createSubList(ArrayList<String> list,int start,int end) throws UnexpectedAction{
		
		if(list!=null){
			List<String> sublist=new ArrayList<>();
			if(start>=0&&end<=list.size()&&start<end){
				sublist=list.subList(start,end);	
			}
			return sublist;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}
		
	}

	public ArrayList<String> getListCopies(ArrayList<String> firstList,ArrayList<String> secondList) throws UnexpectedAction{
		
		if(firstList!=null||secondList!=null){
			ArrayList<String> thirdList=new ArrayList<>();
			thirdList.addAll(firstList);
			thirdList.addAll(secondList);
			return thirdList;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}
	}

	public ArrayList<String> addAhead(ArrayList<String> firstList,ArrayList<String> secondList) throws UnexpectedAction{

		if(firstList!=null||secondList!=null){
			ArrayList<String> thirdList=new ArrayList<>();
			thirdList.addAll(firstList);
			thirdList.addAll(0,secondList);
			return thirdList;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}
	}

	public boolean removingObject(ArrayList<Float> list) throws UnexpectedAction{

		
		
		if(list!=null){
			System.out.println("1->Remove by giving the element\n2->Remove by giving index");
			int remove_Choice=scan.nextInt();

			System.out.println("Enter five decimal numbers to add");
			for(int i=0;i<5;i++){
				list.add(scan.nextFloat());
			}

			System.out.println("The list items are");
			for(float item:list){
				System.out.println(item);
			}

			if(remove_Choice==1){

				System.out.println("Choose one number to remove from the list");
				float num=scan.nextFloat();

				if(list.contains(num)){
					list.remove(num);
					return true;
				}
				return false;
			}
		
			System.out.println("Enter the index");
			int index=scan.nextInt();

	    		if(index<list.size()){
				list.remove(index);
				return true;
			}
			return false;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}
		
			
			
	}

	public boolean removeByRange(ArrayList<Long> list) throws UnexpectedAction{
		
		if(list!=null){
			
			System.out.println("Enter five long numbers to add");
			for(int i=0;i<5;i++){
				list.add(scan.nextLong());
			}

			System.out.println("Enter the start and end index");
			int start=scan.nextInt();
			int end=scan.nextInt();
			if(start>=0&&end<list.size()&&start<end){
				list.subList(start,end).clear();
				return true;
			}
			return true;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}

	}

	public boolean removing_Common_Elements(ArrayList<String> first_List,List<String> sec_List) throws UnexpectedAction{

		if(first_List!=null||sec_List!=null){
			System.out.println("Enter the start and end index to append the elements to the second list");
			int start=scan.nextInt();
			int end=scan.nextInt();

			if(start>=0&&end<first_List.size()&&start<end){
				sec_List=first_List.subList(start,end);
				System.out.println("The first list elements are");
				System.out.println(first_List);
				System.out.println("The second list elements are");
				System.out.println(sec_List);
			
				first_List.removeAll(sec_List);
				return true;
			}
			return false;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}
		
	}

	public void remove_Entire_Entries(ArrayList<Long> list) throws UnexpectedAction{
		
		if(list!=null){
			System.out.println("Enter five long numbers to add");
			for(int i=0;i<5;i++){
				list.add(scan.nextLong());
			}
			System.out.println("Before removing ");
			System.out.println(list);
			list.clear();
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}

		
	}

	public boolean check_Availability(ArrayList<String> list) throws UnexpectedAction{

		if(list!=null){
			System.out.println("Enter the string to check for availability in list");
			String toCheck=scan.next();
			if(list.contains(toCheck)){
				return true;
			}
			return false;
		}
		else{
			
			throw new UnexpectedAction("List can't be null");
		}
		
	}

}

	