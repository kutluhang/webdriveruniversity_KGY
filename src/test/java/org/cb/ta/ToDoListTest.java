package org.cb.ta;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ToDoListTest {
    ToDoList toDoList  = new ToDoList();
    @Test   //(enabled = false) calismasini istemediginiz testler icin boyle yapin
    public void clickPlusTest () throws InterruptedException {
        toDoList.clickPlus();
    }

    @Test
    public void AddNewToDoTest () throws InterruptedException {
        toDoList.addNewToDo();
    }
    @Test
    public void DeleteToDoTest(){
        toDoList.deleteToDo();
    }

    @Test(dependsOnMethods = {"AddNewToDoTest"})
    public void testDeleteOneTask() {
        assertTrue(toDoList.deleteOneTask("do Something"));
    }

}
