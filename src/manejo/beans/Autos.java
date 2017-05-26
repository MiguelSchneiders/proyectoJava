package manejo.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "dtBasicView")
@ViewScoped
public class Autos implements Serializable {

	private static final long serialVersionUID = 2051097699012395077L;

	private List<String> cars;


}
