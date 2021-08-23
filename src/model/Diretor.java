package model;

public class Diretor {

    private Integer id;
    private String nome;
    private String cpf;
    private Double salario;
    private Double Bonus;

    public Diretor(Integer id, String nome, String cpf, Double salario, Double bonus) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        Bonus = bonus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonus() {
        return Bonus;
    }

    public void setBonus(Double bonus) {
        Bonus = bonus;
    }
}
