package main.java;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Random;

public class SortAlgosTest {
	SortAlgos sort = new SortAlgos();
	
	

	
	/*
	 *  throw new nullpointerException()
	 *  edge and condition coverage
	 */
	
	@Test
	public void test1() {
		Item[] nullList = null;	
		sort.bubbleSort(nullList);
	}
	
	/*
	 * node coverage and edge coverage
	 */
	@Test
	public void test2() {
		Item[] list = new Item[5];	
		//Item[] standard = build();
		
		list[0] = new Item(4);
		list[1] = new Item(3);
		list[2] = new Item(1);
		list[3] = new Item(5);
		list[4] = new Item(2);
		
		sort.bubbleSort(list);
		//assertTrue((list[0].key == 1 )&& (list[1].key == 2) && (list[2].key == 3)&&(list[3].key == 4)&&(list[4].key == 5));
		
		//assertEquals(list, standard);
		if((list[0].key != 1 ) || (list[1].key != 2) || (list[2].key != 3) || (list[3].key != 4) ||(list[4].key!= 5)) {
			fail("not correct");
		}
		
	}
	
	/*
	 *  test selectionSort
	 */
	
	@Test
	public void testSelectionSort() {
		Item[] list = new Item[5];	
		
		list[0] = new Item(4);
		list[1] = new Item(3);
		list[2] = new Item(1);
		list[3] = new Item(5);
		list[4] = new Item(2);
		
		sort.selectionSort(list);
		if((list[0].key != 1 ) || (list[1].key != 2) || (list[2].key != 3) || (list[3].key != 4) ||(list[4].key!= 5)) {
			fail("not correct");
		}
	}
	
	@Test
	public void testSelectionSort2() {
		Item[] list = null;	
		
		sort.selectionSort(list);
		
	}
	
	@Test
	public void testInsertionSort() {
		Item[] list = new Item[5];	
		
		
		list[0] = new Item(4);
		list[1] = new Item(3);
		list[2] = new Item(1);
		list[3] = new Item(5);
		list[4] = new Item(2);
		
		sort.insertionSort(list);
		if((list[0].key != 1 ) || (list[1].key != 2) || (list[2].key != 3) || (list[3].key != 4) ||(list[4].key!= 5)) {
			fail("not correct");
		}
	}
	@Test
	public void testInsertionSort2() {
		Item[] list = null;	
		
		sort.insertionSort(list);
		
	}
	@Test
	public void testmergeSort() {
		Item[] list = new Item[5];	
		
		
		list[0] = new Item(4);
		list[1] = new Item(3);
		list[2] = new Item(1);
		list[3] = new Item(5);
		list[4] = new Item(2);
		
		sort.mergeSort(list);
		if((list[0].key != 1 ) || (list[1].key != 2) || (list[2].key != 3) || (list[3].key != 4) ||(list[4].key!= 5)) {
			fail("not correct");
		}
	}
	
	@Test
	public void testmergeSort2() {
		Item[] list = null;	
		
		sort.mergeSort(list);
		
	}
	
	@Test
	public void testquickSort1() {
		Item[] list = new Item[5];	
		
		
		list[0] = new Item(4);
		list[1] = new Item(3);
		list[2] = new Item(1);
		list[3] = new Item(5);
		list[4] = new Item(2);
		
		sort.quickSort(list);
		if((list[0].key != 1 ) || (list[1].key != 2) || (list[2].key != 3) || (list[3].key != 4) ||(list[4].key!= 5)) {
			fail("not correct");
		}
	}
	@Test
	public void testquickSort2() {
		Item[] list = new Item[5];	
		
		
		list[0] = new Item(5);
		list[1] = new Item(4);
		list[2] = new Item(3);
		list[3] = new Item(2);
		list[4] = new Item(1);
		
		sort.quickSort(list);
		if((list[0].key != 1 ) || (list[1].key != 2) || (list[2].key != 3) || (list[3].key != 4) ||(list[4].key!= 5)) {
			fail("not correct");
		}
	}
	
	@Test
	public void testquickSort3() {
		Item[] list = new Item[5];	
		
		
		list[0] = new Item(1);
		list[1] = new Item(1);
		list[2] = new Item(1);
		list[3] = new Item(1);
		list[4] = new Item(1);
		
		sort.quickSort(list);
		if((list[0].key != 1 ) || (list[1].key != 1) || (list[2].key != 1) || (list[3].key != 1) ||(list[4].key!= 1)) {
			fail("not correct");
		}
	}
	@Test
	public void testquickSort4() {
		Item[] list = null;	
		
		sort.quickSort(list);
			fail("null");
		
	}
	
	@Test
	public void testheapSort() {
		Item[] list = new Item[5];	
		
		
		list[0] = new Item(4);
		list[1] = new Item(3);
		list[2] = new Item(1);
		list[3] = new Item(5);
		list[4] = new Item(2);
		
		sort.heapSort(list);
		if((list[0].key != 1 ) || (list[1].key != 2) || (list[2].key != 3) || (list[3].key != 4) ||(list[4].key!= 5)) {
			fail("not correct");
		}
	}
	
	@Test
	public void testheapSort2() {
		Item[] list = new Item[5];	
		
		
		list[0] = new Item(1);
		list[1] = new Item(2);
		list[2] = new Item(3);
		list[3] = new Item(4);
		list[4] = new Item(5);
		
		sort.heapSort(list);
		if((list[0].key != 1 ) || (list[1].key != 2) || (list[2].key != 3) || (list[3].key != 4) ||(list[4].key!= 5)) {
			fail("not correct");
		}
	}
	@Test
	public void testheapSort3() {
		Item[] list = null;
		
		
		sort.heapSort(list);
		
		}
	}
	

