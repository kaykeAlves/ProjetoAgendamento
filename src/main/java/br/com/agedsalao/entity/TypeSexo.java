package br.com.agedsalao.entity;

public enum TypeSexo{
	
	M("Masculino") ,F("Feminino");

 private String descricao;
    
    //construtor - obs: construtor de um enum
    //n�o pode ser public
   TypeSexo (String descricao){
        this.descricao= descricao;
    }

    //get e set
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}