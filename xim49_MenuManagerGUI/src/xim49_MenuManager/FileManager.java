package xim49_MenuManager;

import java.util.*;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.util.ArrayList;

public class FileManager {
	final static String SPLIT = "@@";

	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entrees = new ArrayList<Entree>(); 
		int arrayIndex = 0; 

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {

				int first = line.indexOf(SPLIT); 
				int second = line.indexOf(SPLIT, first + 1);

				entrees.add(arrayIndex, 
						new Entree(line.substring(0, first), 
								line.substring(first + 2, second), 
								Integer.parseInt(line.substring(second + 2)), 0));
				arrayIndex++; 
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return entrees;
	}

	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sides = new ArrayList<Side>();
		int arrayIndex = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				int first = line.indexOf(SPLIT);
				int second = line.indexOf(SPLIT, first + 1);
				sides.add(arrayIndex, new Side(line.substring(0, first), line.substring(first + 2, second),
						Integer.parseInt(line.substring(second + 2)), 0));
				arrayIndex++;
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sides;
	}

	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> salads = new ArrayList<Salad>();
		int arrayIndex = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				int first = line.indexOf(SPLIT);
				int second = line.indexOf(SPLIT, first + 1);
				salads.add(arrayIndex, new Salad(line.substring(0, first), line.substring(first + 2, second),
						Integer.parseInt(line.substring(second + 2)), 0));
				arrayIndex++;
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return salads;
	}

	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		int arrayIndex = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				int first = line.indexOf(SPLIT);
				int second = line.indexOf(SPLIT, first + 1);
				desserts.add(arrayIndex, new Dessert(line.substring(0, first), line.substring(first + 2, second),
						Integer.parseInt(line.substring(second + 2)), 0));
				arrayIndex++;
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return desserts;
	}


	public static Map<Integer, List> readItems(String fileName)
	{
		ArrayList entrees = new ArrayList();
		ArrayList sides = new ArrayList();
		ArrayList salads = new ArrayList();
		ArrayList desserts = new ArrayList();
		Map<Integer, List> m1 = new HashMap<Integer, List>();
		try
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			Entree entree = null;
			Side side = null;
			Salad salad = null;
			Dessert dessert = null;
			String str;
			while ((str = br.readLine()) != null)
			{
				String[] name = str.split("@@");
				if (name[0].equalsIgnoreCase("Entree")) {
					entree = new Entree(name[0], name[1], Integer.parseInt(name[2]));
				} else if (name[0].equalsIgnoreCase("Side")) {
					side = new Side(name[0], name[1], Integer.parseInt(name[2]));
				} else if (name[0].equalsIgnoreCase("Salad")) {
					salad = new Salad(name[0], name[1], Integer.parseInt(name[2]));
				} else if (name[0].equalsIgnoreCase("Dessert")) {
					dessert = new Dessert(name[0], name[1], Integer.parseInt(name[2]));
				}
				/* entree = new Entree(name[0], name[1], Integer.parseInt(name[2])); */
				entrees.add(entree);
				sides.add(side);
				salads.add(salad);
				desserts.add(dessert);
			}
			m1.put(1, entrees);
			m1.put(2, sides);
			m1.put(3, salads);
			m1.put(4, desserts);
			br.close();
			fr.close();
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
		return m1;
	}


}