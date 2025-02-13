package lab3.stack;

/**
 * Класс, представляющий структуру данных "Стек"
 */
public class LabStack {

    /**
     * Следующий элемент стека
     */
    private StackElement next;

    /**
     * Метод для помещения элемента в стек
     *
     * @param elem элемент, который необходимо поместить в стек
     */
    public void push(String elem) {
        StackElement stackElement = new StackElement(elem);

        if (this.next == null) {
            this.next = stackElement;
        } else {
            stackElement.setNext(this.next);
            this.next = stackElement;
        }
    }

    /**
     * Метод для вытаскивания элемента из стека. Если стек пуст - возвращает null
     *
     * @return следующий элемент стека
     */
    public String pop() {
        if (this.next == null) {
            return null;
        } else {
            StackElement retVal = this.next;
            this.next = retVal.getNext();
            return retVal.getValue();
        }
    }
}