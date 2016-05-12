package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class OrderedList {

    private DLink first;
    private DLink last;
    private int quantity;

    public void add(Entity entity) {

        DLink newLink = new DLink(entity);

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

            DLink previous = getOLink(position - 1);
            DLink next = getOLink(position + 1);

            previous.setNext(next);
            next.setPrevious(previous);

            quantity--;
        }
    }

    public int getLength() {
        return quantity;
    }

    public String showList() {

        DLink temp = first;
        String names = "";

        for (int i = 0; i < quantity; i++) {
            names += temp.getEntity().getId() + " ";
            temp = temp.getNext();
        }

        return names;
    }

    public String showReverseList() {

        DLink temp = last;
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

    private DLink getOLink(int position) {

        if (!isOccupied(position)) {
            throw new IllegalArgumentException("A posicao digitada esta fora do range.");
        }

        DLink temp = first;

        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
        }

        return temp;
    }

    private int returnPosition(DLink newLink) {

        DLink temp = first;
        int count = 0;

        for (int i = 0; i < quantity; i++) {
            if ((newLink.getEntity().getId().compareTo(temp.getEntity().getId())) > 0) {
                count++;
            }

            temp = temp.getNext();
        }

        return count;
    }

    private void addBetween(int position, DLink newLink) {

        if (position == 0) {

            addFirst(newLink);
        } else if (position == quantity) {

            addLast(newLink);
        } else {

            DLink previous = getOLink(position - 1);
            DLink next = getOLink(position);

            previous.setNext(newLink);
            newLink.setNext(next);
            next.setPrevious(newLink);
            newLink.setPrevious(previous);

            quantity++;
        }
    }

    private void addFirst(DLink newLink) {

        newLink.setNext(first);
        first.setPrevious(newLink);
        first = newLink;

        quantity++;
    }

    private void addLast(DLink newLink) {

        last.setNext(newLink);
        newLink.setPrevious(last);
        last = newLink;

        quantity++;
    }

}
