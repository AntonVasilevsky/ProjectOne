package com.patterns;

public class Worker {
        private Storage storage;
        public Worker(){
            storage = Storage.getInstance();
        }
        public void work(String s){
            storage.addItem(s);
        }

    public Storage getStorage() {
        return storage;
    }
}
