package ru.job4j.polymorphism;

public class Service {
    private IStore store;

    public Service(IStore store) {
        this.store = store;
    }

    public void add() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        FileStore fileStore = new FileStore();
        Service service = new Service(fileStore);
        service.add();

        //Service service = new Service(fileStore);
        //service.add();
        /* MemoryStore memoryStore = new MemoryStore(); */
    }
}
