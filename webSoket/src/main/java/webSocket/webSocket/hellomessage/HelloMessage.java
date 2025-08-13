package webSocket.webSocket.hellomessage;


import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter

public class HelloMessage {

    private String name;

    public HelloMessage() {

    }

    public HelloMessage(String name) {this.name = name;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
