package com.sample.test;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class ArrayListTest {
    private ArrayList<String> list =new ArrayList<String>();
    @Before
    public void setList() throws Exception{

    }

    @Test
    public void testDeletion(){
        list.clear();
        assertTrue(list.isEmpty());

        list.add("A");
        list.add("B");
        list.add("C");
        list.remove("B");
        assertEquals(2,list.size());

    }
}

