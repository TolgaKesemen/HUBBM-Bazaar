package HubbmBazaar;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class ReadWrite {
	static boolean x = false;
	static ArrayList<Item> item = new ArrayList<Item>();
	static ArrayList<Admin> admin = new ArrayList<Admin>();
	static ArrayList<Technician> tech = new ArrayList<Technician>();
	static ArrayList<Customer> customer = new ArrayList<Customer>();
	/**
	 * That methods takes an array of string that comes from main
	 * and creating objects by reading user and item file with respect to 
	 * first command of a line. Then adding the objects to appropriate ArrayList.
	 * @param words
	 */
	public void Read(String[] words){
		
		switch(words[0]){
		case "ADMIN" :
			admin.add(new Admin(words[1], words[2], words[3], Integer.parseInt(words[4]), words[5]));
			break;
		case "TECH" :
			tech.add(new Technician(words[1], words[2], words[3], Integer.parseInt(words[4]), Integer.parseInt(words[5])));
			break;
		case "CUSTOMER"	:
			customer.add(new Customer(words[1], words[2], words[3], Double.parseDouble(words[4]), words[5]));
			break;
		default :
			break;
		}
		switch(words[0]){
		case "DESKTOP" :
			item.add(new Desktop(Integer.parseInt(words[1]), Integer.parseInt(words[4]), Integer.parseInt(words[5]), words[2], 
				words[3], words[6], words[7], Integer.parseInt(words[8]), Integer.parseInt(words[9]), words[10]));
			break;
		case "LAPTOP" :
			item.add(new Laptop(Integer.parseInt(words[1]), Integer.parseInt(words[4]), Integer.parseInt(words[5]), words[2], 
					words[3], words[6], words[7], Integer.parseInt(words[8]), Integer.parseInt(words[9]), 
					Integer.parseInt(words[10])));
			break;
		case "TABLET" :
			item.add(new Tablet(Integer.parseInt(words[1]), Integer.parseInt(words[4]), Integer.parseInt(words[5]), words[2], 
					words[3], words[6], words[7], Integer.parseInt(words[8]), Integer.parseInt(words[9]), words[10]));
			break;
		case "TV" :
			item.add(new Tv(Integer.parseInt(words[1]), Integer.parseInt(words[4]), Integer.parseInt(words[5]), words[2], 
					words[3], Integer.parseInt(words[6])));
			break;
		case "SMARTPHONE" :
			item.add(new SmartPhone(Integer.parseInt(words[1]), Integer.parseInt(words[4]), Integer.parseInt(words[5]), words[2], 
					words[3], words[6]));
			break;
		case "BOOK" :
			item.add(new Book(Integer.parseInt(words[1]), Integer.parseInt(words[2]), words[4], words[3], words[5], 
					Integer.parseInt(words[6])));
			break;
		case "CDDVD" :
			item.add(new CdDvd(Integer.parseInt(words[1]), Integer.parseInt(words[2]), words[3], words[4], words[5]));
			break;
		case "HAIRCARE" :
			item.add(new HairCare(Integer.parseInt(words[1]), Integer.parseInt(words[5]), Integer.parseInt(words[6]), 
					Integer.parseInt(words[4]), words[2], words[3], Integer.parseInt(words[7])));
			break;
		case "SKINCARE" :
			item.add(new SkinCare(Integer.parseInt(words[1]), Integer.parseInt(words[5]), Integer.parseInt(words[6]), 
					Integer.parseInt(words[4]), words[2], words[3], Integer.parseInt(words[7])));
			break;
		case "PERFUME" :
			item.add(new Perfume(Integer.parseInt(words[1]), Integer.parseInt(words[5]), Integer.parseInt(words[6]), 
					Integer.parseInt(words[4]), words[2], words[3], Integer.parseInt(words[7])));
		}
	}
	/**
	 * That methods takes a BufferedWriter buffer, an array of string that comes 
	 * from main and doing events and actions with respect to first command in
	 * the commands text file. e.g. "ADDCUSTOMER, SHOWCUSTOMER, SHOWCUSTOMERS, 
	 * SHOWADMININFO, ADDADMIN, ADDTECH, LISTITEM, SHOWITEMSLOWONSTOCK, ADDTOCART, 
	 * EMPTYCART, ORDER".
	 * @param words
	 * @param buffer
	 * @throws Exception
	 */
	public void Write(String[] words, BufferedWriter buffer)throws Exception{
		x = false;
		System.out.println();
		switch(words[0]){
			case "ADDCUSTOMER" :
				for(int k = 0; k<admin.size(); k++){
					if(admin.get(k).name.compareToIgnoreCase(words[1])==0){
						customer.add(new Customer(words[2], words[3], words[4], Double.parseDouble(words[5]), words[6]));
						buffer.write("\n");
						x = true;
						break;
					}
				}
				if(!x){
					buffer.write("No admin person named " + words[1] + " exists!\n\n");
				}
				break;
			case "SHOWCUSTOMER" :
				for(int k = 0; k<admin.size(); k++){
					if(admin.get(k).name.compareToIgnoreCase(words[1])==0){
						buffer.write(customer.get(Integer.parseInt(words[2])-1)+"\n\n");
						x = true;
						break;
					}
				}
				if(!x){
					buffer.write("No admin person named " + words[1] + " exists!\n\n");
				}
				break;
			case "SHOWCUSTOMERS" :
				for(int k = 0; k<admin.size(); k++){
					if(admin.get(k).name.compareToIgnoreCase(words[1])==0){
						for(int l = 0; l<customer.size(); l++){
							buffer.write("Customer name: " + customer.get(l).name + 
									"\t" + "ID: " + (l+1) + "\t" + "e-mail: " + customer.get(l).email + 
									"\t" + "Date of Birth: " + customer.get(l).dateOfBirth + 
									"\t" + "Status: " + customer.get(l).status);
							buffer.write("\n");
						}
						x = true;
						break;
					}
				}
				if(!x){
					buffer.write("No admin person named " + words[1] + " exists!");
					buffer.write("\n\n");
				}
				break;
			case "SHOWADMININFO" :
				for(int k = 0; k<admin.size(); k++){
					if(admin.get(k).name.compareToIgnoreCase(words[1])==0){
						buffer.write(admin.get(k)+"\n");
						buffer.write("\n");
						x = true;
						break;
					}
				}
				if(!x){
					buffer.write("No admin person named " + words[1] + " exists!");
					buffer.write("\n\n");
				}
				break;
			case "ADDADMIN" :
				for(int k = 0; k<admin.size(); k++){
					if(admin.get(k).name.compareToIgnoreCase(words[1])==0){
						admin.add(new Admin(words[2], words[3], words[4], Integer.parseInt(words[5]), words[6]));
						x = true;
						break;
					}
				}
				if(!x){
					buffer.write("No admin person named " + words[1] + " exists!");
					buffer.write("\n\n");
				}
				break;
			case "ADDTECH" :
				for(int k = 0; k<admin.size(); k++){
					if(admin.get(k).name.compareToIgnoreCase(words[1])==0){
						tech.add(new Technician(words[2], words[3], words[4], Integer.parseInt(words[5]), Integer.parseInt(words[6])));
						x = true;
						break;
					}
				}
				if(!x){
					buffer.write("No admin person named " + words[1] + " exists!");
					buffer.write("\n\n");
				}
				break;
			case "LISTITEM" :
				for(int k = 0; k<admin.size(); k++){
					if(admin.get(k).name.compareToIgnoreCase(words[1])==0){
						for(int l = 0; l<item.size(); l++){
							buffer.write("-----------------------\n");
							buffer.write(item.get(l)+"\n");
						}
						x = true;
						break;
					}
				}
				for(int k = 0; k<tech.size(); k++){
					if(tech.get(k).name.compareToIgnoreCase(words[1])==0){
						for(int l = 0; l<item.size(); l++){
							buffer.write("-----------------------\n");
							buffer.write(item.get(l)+"\n");
						}
						x = true;
						break;
					}
				}
				if(!x){
					buffer.write("No admin or technician person named " + words[1] + " exists!\n\n");
				}
				break;
			case "SHOWITEMSLOWONSTOCK" :
				for(int k = 0; k<admin.size(); k++){
					if(admin.get(k).name.compareToIgnoreCase(words[1])==0){
						if(words[2]==null){
							buffer.write("Book : " + Book.stock +"\n");
							buffer.write("CdDvd : " + CdDvd.stock + "\n");
							buffer.write("Perfume : " + Perfume.stock + "\n");
							buffer.write("HairCare : " + HairCare.stock + "\n");
							buffer.write("SkinCare : " + SkinCare.stock + "\n");
							buffer.write("Tv : " + Tv.stock + "\n");
							buffer.write("SmartPhone : " + SmartPhone.stock + "\n");
							buffer.write("Desktop : " + Desktop.stock + "\n");
							buffer.write("Laptop : " + Laptop.stock + "\n");
							buffer.write("Tablet : " + Tablet.stock + "\n");
						}
						else{
							if(Book.stock<Integer.parseInt(words[2]))	{	buffer.write("Book : " + Book.stock + "\n");	}
							if(CdDvd.stock<Integer.parseInt(words[2]))	{	buffer.write("CdDvd : " + CdDvd.stock + "\n");	}
							if(Perfume.stock<Integer.parseInt(words[2]))	{	buffer.write("Perfume : " + Perfume.stock + "\n");	}
							if(HairCare.stock<Integer.parseInt(words[2]))	{	buffer.write("HairCare : " + HairCare.stock + "\n");	}
							if(SkinCare.stock<Integer.parseInt(words[2]))	{	buffer.write("SkinCare : " + SkinCare.stock + "\n");	}
							if(Tv.stock<Integer.parseInt(words[2]))	{	buffer.write("Tv : " + Tv.stock + "\n");	}
							if(SmartPhone.stock<Integer.parseInt(words[2]))	{	buffer.write("SmartPhone : " + SmartPhone.stock + "\n");	}
							if(Desktop.stock<Integer.parseInt(words[2]))	{	buffer.write("Desktop : " + Desktop.stock + "\n");	}
							if(Laptop.stock<Integer.parseInt(words[2]))	{	buffer.write("Laptop : " + Laptop.stock + "\n");	}
							if(Tablet.stock<Integer.parseInt(words[2]))	{	buffer.write("Tablet : " + Tablet.stock + "\n");	}
						}
						buffer.write("\n");
						x = true;
						break;
					}
				}
				for(int k = 0; k<tech.size(); k++){
					if(tech.get(k).name.compareToIgnoreCase(words[1])==0){
						if(words[2]==null){
							buffer.write("Book : " + Book.stock +"\n");
							buffer.write("CdDvd : " + CdDvd.stock + "\n");
							buffer.write("Perfume : " + Perfume.stock + "\n");
							buffer.write("HairCare : " + HairCare.stock + "\n");
							buffer.write("SkinCare : " + SkinCare.stock + "\n");
							buffer.write("Tv : " + Tv.stock + "\n");
							buffer.write("SmartPhone : " + SmartPhone.stock + "\n");
							buffer.write("Desktop : " + Desktop.stock + "\n");
							buffer.write("Laptop : " + Laptop.stock + "\n");
							buffer.write("Tablet : " + Tablet.stock + "\n");
						}
						else{
							if(Book.stock<Integer.parseInt(words[2]))	{	buffer.write("Book : " + Book.stock + "\n");	}
							if(CdDvd.stock<Integer.parseInt(words[2]))	{	buffer.write("CdDvd : " + CdDvd.stock + "\n");	}
							if(Perfume.stock<Integer.parseInt(words[2]))	{	buffer.write("Perfume : " + Perfume.stock + "\n");	}
							if(HairCare.stock<Integer.parseInt(words[2]))	{	buffer.write("HairCare : " + HairCare.stock + "\n");	}
							if(SkinCare.stock<Integer.parseInt(words[2]))	{	buffer.write("SkinCare : " + SkinCare.stock + "\n");	}
							if(Tv.stock<Integer.parseInt(words[2]))	{	buffer.write("Tv : " + Tv.stock + "\n");	}
							if(SmartPhone.stock<Integer.parseInt(words[2]))	{	buffer.write("SmartPhone : " + SmartPhone.stock + "\n");	}
							if(Desktop.stock<Integer.parseInt(words[2]))	{	buffer.write("Desktop : " + Desktop.stock + "\n");	}
							if(Laptop.stock<Integer.parseInt(words[2]))	{	buffer.write("Laptop : " + Laptop.stock + "\n");	}
							if(Tablet.stock<Integer.parseInt(words[2]))	{	buffer.write("Tablet : " + Tablet.stock + "\n");	}
						}
						buffer.write("\n");
						x = true;
						break;
					}
				}
				if(!x){
					buffer.write("No admin or technician person named " + words[1] + " exists!\n\n");
				}
				break;
			case "ADDTOCART" :
				if(customer.size()>=(Integer.parseInt(words[1]))){
					if(item.size()>=(Integer.parseInt(words[2]))){
						if(item.get(Integer.parseInt(words[2])-1).getStock()>0){
							customer.get(Integer.parseInt(words[1])-1).shoppingcart.add(item.get(Integer.parseInt(words[2])-1));
							buffer.write("The item " + item.get(Integer.parseInt(words[2])-1).name() + " has been successfully added to your cart.\n");
							x = true;
						}
						else{
							buffer.write("We are sorry. The item is temporarily unavailable.\n");
						}
					}
					else{
						buffer.write("Invalid item ID\n");
					}
					}
				if(!x){
					buffer.write("No customer with ID number " + words[1] + " exists!\n\n");
				}
				break;
			case "EMPTYCART" :
				if(customer.size()>=(Integer.parseInt(words[1]))){
					customer.get(Integer.parseInt(words[1])).history.addAll(customer.get(Integer.parseInt(words[1])).shoppingcart);
					customer.get(Integer.parseInt(words[1])).shoppingcart.clear();
					buffer.write("The cart has been emptied.\n\n");
					x = true;
					}
				if(!x){
					buffer.write("No customer with ID number " + words[1] + " exists!\n\n");
				}
				break;
			case "ORDER" :
				if(customer.size()>=(Integer.parseInt(words[1]))){
					if(customer.get(Integer.parseInt(words[1])-1).password.equalsIgnoreCase(words[2])){
						int total = 0;
						for(int k = 0; k<customer.get(Integer.parseInt(words[1])-1).shoppingcart.size(); k++){
							total += customer.get(Integer.parseInt(words[1])-1).shoppingcart.get(k).price;					
						}
						customer.get(Integer.parseInt(words[1])-1).spend = total;
						customer.get(Integer.parseInt(words[1])-1).balance -= total;
						if(customer.get(Integer.parseInt(words[1])-1).spend>999){
							customer.get(Integer.parseInt(words[1])-1).status = "SILVER";
						}
						if(customer.get(Integer.parseInt(words[1])-1).spend>4999){
							customer.get(Integer.parseInt(words[1])-1).status = "GOLDEN";
						}
						customer.get(Integer.parseInt(words[1])-1).history.addAll(customer.get(Integer.parseInt(words[1])-1).shoppingcart);
						customer.get(Integer.parseInt(words[1])-1).shoppingcart.clear();
						buffer.write("Done! Your order will be delivered as soon as possible. Thank you!\n");
						x = true;
					}
					}
				if(!x){
					buffer.write("No customer with ID number " + words[1] + " exists!\n\n");
				}
				break;
		}
	}
}
