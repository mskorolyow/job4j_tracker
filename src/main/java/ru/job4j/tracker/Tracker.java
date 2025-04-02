package ru.job4j.tracker;

import java.util.Arrays;

/**
 * //System.arraycopy(items, index + 1, items, index, size - index - 1);
 * Закинуть в метод delete, при необходимости, урок: https://job4j.ru/profile/exercise/22/task/161/538354
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 0;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int j = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                result[j] = item;
                j++;
            }
        }
        return Arrays.copyOf(result, j);
    }

    private int indexOf(int id) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                if (items[i].getId() == id) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        } else {
            items[index] = item;
            return true;
        }
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (items.length > id) {
            items[index] = null;
        }
    }
}