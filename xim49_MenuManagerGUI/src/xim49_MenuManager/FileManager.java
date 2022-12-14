package xim49_MenuManager;

import java.util.*;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.util.ArrayList;

public class FileManager {

	public static ArrayList readEntrees(String fileName)

	{

		ArrayList entrees = new ArrayList();

		try

		{

			FileReader fr = new FileReader(fileName);

			BufferedReader br = new BufferedReader(fr);

			Entree entree = null;

			String str;

			while ((str = br.readLine()) != null)

			{

				String[] name = str.split("@@");

				entree = new Entree(name[0], name[1], Integer.parseInt(name[2]));

				entrees.add(entree);

			}

			br.close();

			fr.close();

		}

		catch (Exception e)

		{

			System.out.println("error");

		}

		return entrees;

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