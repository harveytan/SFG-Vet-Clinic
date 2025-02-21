package guru.commerce.vetclinic.services.map;

import guru.commerce.vetclinic.model.BaseEntity;

import java.util.*;

abstract class AbstractMapService <T extends BaseEntity, ID extends Long>{
    private Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    T save(T object){
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else {
            throw new RuntimeException("object is null");
        }
        return object;
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextId;
        try {
            nextId = Collections.max(this.map.keySet()) + 1;
        }catch (NoSuchElementException ex){
            nextId = 1L;
        }
        return nextId;
    }
}
