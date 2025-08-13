package webSocket.webSocket.greeting;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
public class Greeting {

    private String content;

    public Greeting(){

    }

    public Greeting(String content){this.content = content;}

    public String getContent(){return content;}
}
