package example.arraylist;
import java.util.*;
import example.UnexpectedAction;
public class ArrayListRunner{
		
	public static void main(String args[]) throws UnexpectedAction{
		
		Scanner scan=new Scanner(System.in);
		int choice=1;
		UseOfArrayList object=new UseOfArrayList();
		
		while(choice!=0){
			

			System.out.println("0->EXIT\n1->Print size\n2->Append elements\n3->Add Custom Objects\n4->Add Distinct type objects\n5->Know the index\n6->Print using Iterator\n7->Get the element\n8->Get the last index\n9->Insert at specific position\n10->Create sublist");
											
			System.out.println("\n11->Copy of lists\n11->Add element ahead\n13->Removing the Element\n14->Remove by Giving Range\n15->Removing Common elements\n16->Remove the entire list elements\n17->Check the String availability");
							
							
			System.out.println("Enter your choice");
			choice=scan.nextInt();
			scan.nextLine();
			switch(choice){
			
				
				case 0:{
					break;
				}
			
				case 1:{
					
					ArrayList<String> list=new ArrayList<>();
					try{
						System.out.println("The Size of the ArrayList is :"+object.getSize(null));
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 2:{
					
					ArrayList<String> list=new ArrayList<>();
					try{
						object.append(null);
						System.out.println("The elements of ArrayList are");
						for(int range=0;range<list.size();range++){

							System.out.println(list.get(range));
						}
						System.out.println("The size of ArrayList:"+object.getSize(list));
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
					
				}
				
				case 3:{

					ArrayList<Object> list=new ArrayList<>();
					
					System.out.println("1->Add Swift Object\n2->Add Car Object");
					int input=scan.nextInt();
					try{
						if(object.addCustomObjects(list,input)){
							System.out.println("Added successfully");
							System.out.println("The string representation of object present in list are :");
							for(Object listitems:list){
								System.out.println(listitems.toString());
							}
						}
						else{
							System.out.println("Enter a valid input");
						}
						
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 4:{

					ArrayList<Object> list=new ArrayList<>();
					try{
						object.addDifferentObjects(list);	
						System.out.println("The elements of list are :");
					
						for(Object item:list){
							if(item.getClass().getSimpleName().equals("String")||item.getClass().getSimpleName().equals("Integer"))
							{
								System.out.println(item);
							}
							else
							{
		
								System.out.println(item.toString());
							}	
						}
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;

				}
	
				case 5:{

					ArrayList<String> list=new ArrayList<>();
					try{
						object.append(list);
						System.out.println("Type an element from the list");
						for(int range=0;range<list.size();range++){

							System.out.println(list.get(range));
						}
						String toFind=scan.nextLine();
						int index=object.getIndex(list,toFind);
						System.out.println("The index of "+toFind+" is "+index);					
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}					
					break;

				}

				case 6:{

					ArrayList<String> list=new ArrayList<>();
					try{
						object.append(list);
						object.usingIterator(list);
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
			
				}

				case 7:{
			
					ArrayList<String> list=new ArrayList<>();
					try{
						object.append(list);
						System.out.println("Enter the index within "+list.size()+" to find the element");
						int index=scan.nextInt();
						String result=object.getElement(list,index);
						System.out.println(result);
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}
			
				case 8:{

					ArrayList<String> list=new ArrayList<>();
					try{
						object.append(list);
						System.out.println("Type an element from the list find first and last index");
						for(int range=0;range<list.size();range++){

							System.out.println(list.get(range));
						}
						String toFind=scan.next();
						System.out.println("the first index of "+toFind+" is "+object.getIndex(list,toFind));
						System.out.println("the last index of "+toFind+" is "+object.getLastIndex(list,toFind));
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 9:{
					
					ArrayList<String> list=new ArrayList<>();
					try{
						object.append(list);
						System.out.println("Before insert"+list);

						System.out.println("Enter the string to be inserted");
						String toInsert=scan.next();
	
						System.out.println("Enter the index");
						int index=scan.nextInt();

						if(object.insertAt(list,toInsert,index)==true){
							System.out.println("After insert"+list);
						}
						else{
							System.out.println("Enter a valid string");
						}
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 10:{
	
					ArrayList<String> list=new ArrayList<>();
					try{
						object.append(list);
						System.out.println("Enter the start index");
						int start=scan.nextInt();
						System.out.println("Enter the end index");
						int end=scan.nextInt();

						List<String> sublist=object.createSubList(list,start,end);
						if(!sublist.isEmpty()){
							System.out.println("The Original list is "+list);
							System.out.println("The sublist is "+sublist);
						}
						else{
							System.out.println("Enter valid start and end index");
						}
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 11:{

					ArrayList<String> firstList=new ArrayList<>();
					ArrayList<String> secondList=new ArrayList<>();
					try{
						object.append(firstList);
						System.out.println("The first list is "+firstList);

						
						object.append(secondList);
						System.out.println("The Second list is "+secondList);
					
						ArrayList<String> thirdList=object.getListCopies(firstList,secondList);
						System.out.println("The Third list is "+thirdList);
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;

				}
		
				case 12:{

					
					ArrayList<String> firstList=new ArrayList<>();
					ArrayList<String> secondList=new ArrayList<>();
					try{
						object.append(firstList);
						System.out.println("The first list is "+firstList);

						
						object.append(secondList);
						System.out.println("The Second list is "+secondList);
					
						ArrayList<String> thirdList=object.addAhead(firstList,secondList);
						System.out.println("The Third list is "+thirdList);
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 13:{
					
					ArrayList<Float> list=new ArrayList<>();
					try{
						boolean value=object.removingObject(list);
						if(value==true){
							System.out.println("After removing");
							for(float item:list){
								System.out.println(item);
							}
						}
						else{
							System.out.println("enter a valid number or index");
						}
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 14:{

					ArrayList<Long> list=new ArrayList<>();
					try{
						boolean value=object.removeByRange(list);
						if(value==true){
							System.out.println("After removing");
							for(long item:list){
								System.out.println(item);
							}
						}
						else{
							System.out.println("enter a valid start and end");
						}
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 15:{

					ArrayList<String> first_List=new ArrayList<>();
					try{
						object.append(first_List);
						List<String> sec_List=new ArrayList<>();
						boolean value=object.removing_Common_Elements(first_List,sec_List);
						if(value==true){
							System.out.println("After removing the common elements from first list");
							for(String item:first_List){
								System.out.println(item);
							}
						}
						else{
							System.out.println("enter a valid index");
						}
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 16:{
				
					ArrayList<Long> list=new ArrayList<>();
					try{
						object.remove_Entire_Entries(list);
						System.out.println("After removing ");
						System.out.println(list);
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}

				case 17:{

					ArrayList<String> list=new ArrayList<>();
					try{	
						object.append(list);
						System.out.println("Is the given string present in list :"+object.check_Availability(list));
					}
					catch(UnexpectedAction e){
						
						throw new UnexpectedAction("Exception occurred by:"+e.getCause()+"\n"+e);
					}
					break;
				}
			}
		}

		
	}
}