package com.main;

class CustomLinkedList {
    Node head;

    CustomLinkedList(Node head) {
        this.head = head;
    }

    CustomLinkedList() {
        this.head = null;
    }

    public Node last() {
        if (head != null) {
            Node current = head;
            while (current.hasNext()) {
                current = current.getNext();
            }
            return current;
        }
        return null;
    }

    public void appendNode(Node node) {
        if (head != null) {
            last().setNext(node);
        } else {
            head = node;
        }
    }

    public void prependNode(Node node) {
        node.setNext(head);
        head = node;
    }

    public void push(int nodeData) {
        Node newNode = new Node(nodeData);
        appendNode(newNode);
    }

    public Node pop() {
        Node current = head;
        while (current.getNext() != this.last()) {
            current = current.getNext();
        }
        current.setNext(null);
        return current;
    }

    public void unshift(int nodeData) {
        prependNode(new Node(nodeData));
    }

    public Node shift() {
        Node deletedNode = head;
        head = head.getNext();
        return deletedNode;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node node) {
        this.head = node;
    }

    public String toString() {
        String str = "[";
        Node current = head;
        if (current != null) {
            str += String.format("%d, ", current.getData());
            while (current.hasNext()) {
                current = current.getNext();
                str += current.hasNext() ? String.format("%d, ", current.getData())
                        : String.format("%d", current.getData());
            }
        }
        str += "]";
        return str;
    }
}