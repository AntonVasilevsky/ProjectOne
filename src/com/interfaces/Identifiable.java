package com.interfaces;

public interface Identifiable {
    void setId(Long id);
    Long getId();
    default boolean equalTo(Identifiable identifiable){
        return this.getClass().equals(identifiable.getClass())&&getId().equals(identifiable.getId());
    }
}
