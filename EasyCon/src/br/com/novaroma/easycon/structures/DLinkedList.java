package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Person;
import br.com.novaroma.easycon.entities.Resident;

public class DLinkedList { //TESTADO - 100% OK!

    private DLink first;
    private DLink last;
    private int count;

    public void addFirst(Entity entity) {

        DLink newLink = new DLink(first, null, entity);
       
        if (!isFirst()) {
            first.setPrevious(newLink);
        }
        
        first = newLink;

        if (isFirst()) 
            last = first;
        
        count++;
    }

    public void addLast(Entity entity) {

        if (isFirst()) {
            addFirst(entity);
        } else {
            DLink newLink = new DLink(null, last, entity);
            last.setNext(newLink);
            last = newLink;

            count++;
        }
    }

    public void addBetween(Entity entity, int position) {

        if (position == 1) {
            addFirst(entity);
        } else if (position == count + 1) {
            addLast(entity);
        } else {
            DLink previous = returnLink(position - 1);
            DLink next = previous.getNext();
            DLink newLink = new DLink(next, previous, entity);

            next.setPrevious(newLink);
            previous.setNext(newLink);
            count++;
        }
    }

    public void removeFirst() {

        if (isFirst()) 
            throw new IllegalArgumentException("Nao ha itens para serem excluidos!");
        

        if (count == 1) {
            first = last = null;
        }
        else {
        first = first.getNext();
        first.setPrevious(null);
        }
        
        count--;
    }

    public void removeLast() {

        if (isFirst()) {
            throw new IllegalArgumentException("Nao ha itens para serem excluidos!");
        }

        if (count == 1) {
            removeFirst();
        } else {
            last = last.getPrevious();
            last.setNext(null);
            count--;
        }
    }

    public void removeBetween(int position) {

        if (position == 1) {
            removeFirst();
        } else if (position == count) {
            removeLast();
        } else {
            DLink previous = returnLink(position - 1);
            DLink next = returnLink(position + 1);

            previous.setNext(next);
            next.setPrevious(previous);
            count--;
        }
    }

    public String showList() {

        DLink temp = first;
        String names = "";

        while (temp != null) {
            
            if (temp.getEntity() instanceof Person) {
                Person person = (Person)temp.getEntity();
                
                names += person.getName() + " ";
            }
            else{
            names += temp.getEntity().getId() + " ";
            }
            
            temp = temp.getNext();
        }

        return names;
    }

    public String showReverseList() {

        DLink temp = last;
        String names = "";
        
        while (temp != null) {
            if (temp.getEntity() instanceof Person) {
                Person person = (Person)temp.getEntity();
                
                names += person.getName() + " ";
            }
            else{
            names += temp.getEntity().getId() + " ";
            }
            
            temp = temp.getPrevious();
        }

        return names;
    }

    public int showQuantity() {
        return count;
    }

    private boolean isFirst() {
        return count == 0;
    }

    private boolean verifyPosition(int position) {
        return position > 0 && position <= count + 1;
    }

    private DLink returnLink(int position) {

        if (!verifyPosition(position)) {
            throw new IllegalArgumentException("Posicao invalida!");
        }

        DLink temp = first;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.getNext();
        }
        return temp;
    }
    
    public static void main(String[] args) {
        
        DLinkedList list = new DLinkedList();
        
        Resident a = new Resident(null, null, null, null, null, "Felipe", null, null, null, true);
        Resident b = new Resident(null, null, null, null, null, "Catarina", null, null, null, true);
        Resident c = new Resident(null, null, null, null, null, "Lucas", null, null, null, true);
        Resident d = new Resident(null, null, null, null, null, "Marina", null, null, null, true);
       
        list.addFirst(a);
        list.addFirst(b);
        list.addLast(c);
        list.addBetween(d, 2);
        System.out.println(list.showList());
        System.out.println(list.showReverseList());
        System.out.println(list.showQuantity());
        
        list.removeBetween(3);
        System.out.println(list.showList());
        System.out.println(list.showReverseList());
        System.out.println(list.showQuantity());    
    }
}
