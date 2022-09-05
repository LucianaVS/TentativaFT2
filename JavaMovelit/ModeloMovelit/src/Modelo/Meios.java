package Modelo;

public class Meios {
    
    private int id_meios;
   
    private int Tipo_Meios;
    
    private Locais locais;
    
    private int getId_meios() {
        return this.id_meios;
    }
    
    private int setId_meios(Integer id_meios) {
        this.id_meios = id_meios;
    }
    
    private int getTipo_Meios() {
        return this.Tipo_Meios;
    }
    
    private int setTipo_Meios(Integer Tipo_Meios) {
        this.Tipo_Meios = Tipo_Meios;
    }
    
    public Locais getLocais() {
		return locais;
	}

	public void setLocais(Locais locais) {
		this.locais = locais;
	}

	public void setId_meios(int id_meios) {
		this.id_meios = id_meios;
	}

	public void setTipo_Meios(int tipo_Meios) {
		Tipo_Meios = tipo_Meios;
	}

	public boolean Escolher() {
       
        return false;
    }
    
    
}
