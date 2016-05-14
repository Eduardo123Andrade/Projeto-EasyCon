package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class OrderedList {

    private Link first;
    private Link last;
    private int quantity;

    public void add(Entity entity) {

        Link newLink = new Link(entity);

        if (isFirst()) {
            first = newLink;
            last = newLink;

            quantity++;
        } else {
            addBetween(returnPosition(newLink), newLink);
        }
    }

    public void removeFirst() {

        if (isFirst()) {
            throw new IllegalArgumentException("Nao existem itens para serem removidos.\n");
        }

        first = first.getNext();

        if (quantity == 1) {
            last = first;
        } else {
            first.setPrevious(null);
        }

        quantity--;
    }

    public void removeLast() {

        if (isFirst()) {
            throw new IllegalArgumentException("Nao existem itens para serem removidos.\n");
        }

        if (quantity == 1) {
            removeFirst();
        } else {
            last = last.getPrevious();
            last.setNext(null);

            quantity--;
        }
    }

    public void removeBetween(int position) {

        if (isFirst()) {
            throw new IllegalArgumentException("Nao existem itens para serem removidos.\n");
        }

        if (position == 0) {

            removeFirst();
        } else if (position == quantity - 1) {

            removeLast();
        } else {

            Link previous = getOLink(position - 1);
            Link next = getOLink(position + 1);

            previous.setNext(next);
            next.setPrevious(previous);

            quantity--;
        }
    }

    public int getLength() {
        return quantity;
    }

    public String showList() {

        Link temp = first;
        String names = "";

        for (int i = 0; i < quantity; i++) {
            names += temp.getEntity().getId() + " ";
            temp = temp.getNext();
        }

        return names;
    }

    public String showReverseList() {

        Link temp = last;
        String names = "";

        for (int i = 0; i < quantity; i++) {
            names += temp.getEntity().getId() + " ";
            temp = temp.getPrevious();
        }

        return names;
    }

    private boolean isFirst() {
        return (quantity == 0);
    }

    private boolean isOccupied(int position) {
        return (position >= 0 && position < quantity);
    }

    private Link getOLink(int position) {

        if (!isOccupied(position)) {
            throw new IllegalArgumentException("A posicao digitada esta fora do range.");
        }

        Link temp = first;

        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
        }

        return temp;
    }

    private int returnPosition(Link newLink) {

        Link temp = first;
        int count = 0;

        for (int i = 0; i < quantity; i++) {
            if ((newLink.getEntity().getId().compareTo(temp.getEntity().getId())) > 0) {
                count++;
            }

            temp = temp.getNext();
        }

        return count;
    }

    private void addBetween(int position, Link newLink) {

        if (position == 0) {

            addFirst(newLink);
        } else if (position == quantity) {

            addLast(newLink);
        } else {

            Link previous = getOLink(position - 1);
            Link next = getOLink(position);

            previous.setNext(newLink);
            newLink.setNext(next);
            next.setPrevious(newLink);
            newLink.setPrevious(previous);

            quantity++;
        }
    }

    private void addFirst(Link newLink) {

        newLink.setNext(first);
        first.setPrevious(newLink);
        first = newLink;

        quantity++;
    }

    private void addLast(Link newLink) {

        last.setNext(newLink);
        newLink.setPrevious(last);
        last = newLink;

        quantity++;
    }

}
