package co.com.proyectobase.screenplay.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TheStage {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

}
