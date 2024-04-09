import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void DeleteNodeBasedOnValue_EmptyList_ListShouldRemainEmpty() {
        //Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        
        //Act
        myLinkedList.DeleteNodeBasedOnValue("Art");
        
        //Assert
        assertEquals(myLinkedList.GetSize(), 0);
    }


@Test
public void DeleteNodeBasedOnValue_SingleNodeList_ShouldDeleteSingleNode(){
    //Arrange
    MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
    
    //Act
    myLinkedList.DeleteNodeBasedOnValue("Art");
    
    //Assert
    assertEquals(myLinkedList.GetSize(), 0);
    //assertTrue(myLinkedList, false);
}

@Test

public void DeleteNodeBasedOnValue_ElementNotInList_ShouldNotChangeList(){
    //Arrange
    MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
    myLinkedList.AddFront("Hello");
    
    //Act
    myLinkedList.DeleteNodeBasedOnValue("Art");
    
    //Assert
    assertEquals(1, myLinkedList.GetSize());
    //assertEquals
}
}