import org.example.ComponentConteyners;
import org.example.SportCar;
import org.example.UnknownCar;
import org.junit.Test;


@Test
public void QTest() {
    //given
    SportCar sportCar = new SportCar();
    UnknownCar unknownCar = new UnknownCar();
    ComponentConteyners componentConteyners = new ComponentConteyners();
    componentConteyners.draw(unknownCar.toString());
    componentConteyners.draw(sportCar.toString());
    //when
    componentConteyners.add(sportCar);
    //then

}

public void main() {
}

