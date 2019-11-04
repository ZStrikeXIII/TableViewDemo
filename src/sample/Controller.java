package sample;

import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

  @FXML
  private TableView<Person> tvPeople;

  @FXML
  private TableColumn<?, ?> colFirstName;

  @FXML
  private TableColumn<?, ?> colLastName;

  @FXML
  private ObservableList<Person> people;

  public void initialize() {

    people = FXCollections.observableArrayList();
    //ObservableList<Person> people = FXCollections.observableArrayList();

    colFirstName.setCellValueFactory(new PropertyValueFactory("firstName"));
    colLastName.setCellValueFactory(new PropertyValueFactory("lastName"));

    tvPeople.setItems(people);
    people.add(new Person("Damien", "Smith"));
    addPerson();
    addPerson();

  }

  public void addPerson() {
    people.add(new Person("Damien", "Smith"));
  }
}