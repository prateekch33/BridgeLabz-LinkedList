package org.example;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    private final LinkedList<Integer> linkedList=new LinkedList<>();
    public void addElements() {
        linkedList.add(56);
        linkedList.add(70);
        linkedList.add(1,30);
    }
//    UC 7
    public Integer findElements(int n) {
        return linkedList.indexOf(30);
    }
//    UC 8
    public void addAtPosition(int index,int n) {
        linkedList.add(linkedList.indexOf(30)+1,40);
    }

    public void printAllElements() {
        for(Integer i:linkedList) {
            System.out.println(i);
        }
    }

    public int removeElement(int n) {
        linkedList.remove((Integer) n);
        return linkedList.size();
    }

    public void sortList() {
        Collections.sort(linkedList);
    }


    public static void main(String[] args) {

//        UC1
//        linkedList.add(56);
//        linkedList.add(30);
//        linkedList.add(70);
//        UC2
//        linkedList.add(70);
//        linkedList.addFirst(30);
//        linkedList.addFirst(56);
//        UC3
//        linkedList.add(56);
//        linkedList.addLast(30);
//        linkedList.addLast(70);
//        UC4
//        linkedList.add(56);
//        linkedList.add(70);
//        linkedList.add(1,30);
//        UC5
//        linkedList.pop();
//        UC6
//        linkedList.removeLast();
        Main ob=new Main();
        ob.addElements();
        ob.printAllElements();
        ob.sortList();
        ob.printAllElements();
    }
}