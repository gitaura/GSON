import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

public class JsonTest {

    @Test
    public void JsonEquals_toJson() {
        Gson gson = new Gson();
        Person person1 = new Person("Jan","Kowalski", 44, 150,"joga");
        String json = gson.toJson(person1);
        Person person2 = gson.fromJson(json,Person.class);
        Person expected = person1;
        Person actual = person2;
        Assert.assertEquals(expected,actual);
    }
}
