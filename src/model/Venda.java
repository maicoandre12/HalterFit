package model;

public class Venda {
    private String codVenda;
    private String qtdTotal, dataVenda, dataPagamento, tipoEntrega, formaPagamento, valorTotal, statusVenda, estorno, descricaoEstorno, descontoVenda, feedback;
    private String fk_usuario, fk_cliente, fk_endereco;

    public String getCodVenda() {
        return codVenda;
    }

    public String getQtdTotal() {
        return qtdTotal;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public String getStatusVenda() {
        return statusVenda;
    }

    public String getEstorno() {
        return estorno;
    }

    public String getDescricaoEstorno() {
        return descricaoEstorno;
    }

    public String getDescontoVenda() {
        return descontoVenda;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getFk_usuario() {
        return fk_usuario;
    }

    public String getFk_cliente() {
        return fk_cliente;
    }

    public String getFk_endereco() {
        return fk_endereco;
    }

    public void setCodVenda(String codVenda) {
        this.codVenda = codVenda;
    }

    public void setQtdTotal(String qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setStatusVenda(String statusVenda) {
        this.statusVenda = statusVenda;
    }

    public void setEstorno(String estorno) {
        this.estorno = estorno;
    }

    public void setDescricaoEstorno(String descricaoEstorno) {
        this.descricaoEstorno = descricaoEstorno;
    }

    public void setDescontoVenda(String descontoVenda) {
        this.descontoVenda = descontoVenda;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setFk_usuario(String fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public void setFk_cliente(String fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    public void setFk_endereco(String fk_endereco) {
        this.fk_endereco = fk_endereco;
    }

    public Venda() {
    }

    public Venda(String codVenda, String qtdTotal, String dataVenda, String dataPagamento, String tipoEntrega, String formaPagamento, String valorTotal, String statusVenda, String estorno, String descricaoEstorno, String descontoVenda, String feedback, String fk_usuario, String fk_cliente, String fk_endereco) {
        this.codVenda = codVenda;
        this.qtdTotal = qtdTotal;
        this.dataVenda = dataVenda;
        this.dataPagamento = dataPagamento;
        this.tipoEntrega = tipoEntrega;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        this.statusVenda = statusVenda;
        this.estorno = estorno;
        this.descricaoEstorno = descricaoEstorno;
        this.descontoVenda = descontoVenda;
        this.feedback = feedback;
        this.fk_usuario = fk_usuario;
        this.fk_cliente = fk_cliente;
        this.fk_endereco = fk_endereco;
    }

    @Override
    public String toString() {
        return "Venda{" + "codVenda=" + codVenda + ", qtdTotal=" + qtdTotal + ", dataVenda=" + dataVenda + ", dataPagamento=" + dataPagamento + ", tipoEntrega=" + tipoEntrega + ", formaPagamento=" + formaPagamento + ", valorTotal=" + valorTotal + ", statusVenda=" + statusVenda + ", estorno=" + estorno + ", descricaoEstorno=" + descricaoEstorno + ", descontoVenda=" + descontoVenda + ", feedback=" + feedback + ", fk_usuario=" + fk_usuario + ", fk_cliente=" + fk_cliente + ", fk_endereco=" + fk_endereco + '}';
    }
    
    
}
