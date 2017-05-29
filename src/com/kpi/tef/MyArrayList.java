package com.kpi.tef;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyArrayList extends ArrayList{

    @Override
    public Object set(int index, Object element) {
        try {
            throw new Exception("This operation is forbidden in this collection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this;
    }

    @Override
    public void add(int index, Object element) {
        try {
            throw new Exception("This operation is forbidden in this collection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Object remove(int index) {
        try {
            throw new Exception("This operation is forbidden in this collection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this;
    }

    @Override
    public boolean remove(Object o) {
        try {
            throw new Exception("This operation is forbidden in this collection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        try {
            throw new Exception("This operation is forbidden in this collection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        try {
            throw new Exception("This operation is forbidden in this collection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean removeIf(Predicate filter) {
        try {
            throw new Exception("This operation is forbidden in this collection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        try {
            throw new Exception("This operation is forbidden in this collection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void sort(Comparator c) {
        try {
            throw new Exception("This operation is forbidden in this collection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
