package model;

public class Produto {
    private String codProduto;
    private String produto, descricao, tipoEquipamento, dataProducao, cor, quantidadeProduto, valorCompra, valorVenda;

    public String getCodProduto() {
        return codProduto;
    }

    public String getProduto() {
        return produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public String getDataProducao() {
        return dataProducao;
    }

    public String getCor() {
        return cor;
    }

    public String getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public String getValorCompra() {
        return valorCompra;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public void setDataProducao(String dataProducao) {
        this.dataProducao = dataProducao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantidadeProduto(String quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setValorCompra(String valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", produto=" + produto + ", descricao=" + descricao + ", tipoEquipamento=" + tipoEquipamento + ", dataProducao=" + dataProducao + ", cor=" + cor + ", quantidadeProduto=" + quantidadeProduto + ", valorCompra=" + valorCompra + ", valorVenda=" + valorVenda + '}';
    }

    public Produto(String codProduto, String produto, String descricao, String tipoEquipamento, String dataProducao, String quantidadeProduto, String valorCompra, String valorVenda) {
        this.codProduto = codProduto;
        this.produto = produto;
        this.descricao = descricao;
        this.tipoEquipamento = tipoEquipamento;
        this.dataProducao = dataProducao;
        this.quantidadeProduto = quantidadeProduto;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
    }

    public Produto() {
    }
    
    
}
