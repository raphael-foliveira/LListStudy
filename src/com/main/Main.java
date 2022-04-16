package com.main;

class Main {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);

        linkedList.pop();
        System.out.println(linkedList);
        linkedList.push(15);
        System.out.println(linkedList);
        linkedList.unshift(65);
        System.out.println(linkedList);

    }
}