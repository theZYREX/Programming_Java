public class intContainerApplication {
    public static void main(String[] args) {

        intContainer container = new intContainer(5);

        try {
            container.push(10);
            container.push(5);
            container.push(20);
            System.out.println(container);

            container.sort();
            System.out.println("После сортировки: " + container);

            System.out.println(container.pop());
            System.out.println(container);


            container.push(1);
            container.push(2);
            container.push(3);

            System.out.println(container);
            container.push(4);

        } catch (ContainerFullException | ContainerEmptyException | SortException e) {
            System.err.println("ОШИБКА: " + e.getMessage());
        }

        System.out.println("\n");

        intContainer sameElementsContainer = new intContainer(5);
        try {
            sameElementsContainer.push(7);
            sameElementsContainer.push(7);
            sameElementsContainer.push(7);
            System.out.println(sameElementsContainer);
            sameElementsContainer.sort();
        } catch (ContainerFullException | SortException e) {
            System.err.println("ОШИБКА: " + e.getMessage());
        }

        System.out.println("\n");

        intContainer emptyContainer = new intContainer(0);
        try{
            emptyContainer.pop();
        } catch (ContainerEmptyException e) {
            System.err.println("Ощибка: " + e.getMessage());
        }

    }
}
