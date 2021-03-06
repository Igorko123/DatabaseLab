package com.pavelchak.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "company")
public class Company {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", nullable = false)
    private Long id;
    @Column(name = "company_name", nullable = false, length = 45)
    private String companyName;
    @Column(name = "author", nullable = false, length = 45)
    private String author;
    @Column(name = "publisher", nullable = true, length = 50)
    private String publisher;
    @Column(name = "imprint_year", nullable = true)
    private Integer imprintYear;
    @Column(name = "amount", nullable = false)
    private Integer amount;
    @ManyToMany(mappedBy = "companies")
    private Set<Director> directors;

    Company(){}
    Company(String companyName, String author, String publisher, Integer imprintYear){
        this.companyName=companyName;
        this.author=author;
        this.publisher=publisher;
        this.imprintYear=imprintYear;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long idCompany) {
        this.id = idCompany;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getImprintYear() {
        return imprintYear;
    }
    public void setImprintYear(Integer imprintYear) {
        this.imprintYear = imprintYear;
    }

    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Set<Director> getDirectors() {
        return directors;
    }
    public void setDirectors(Set<Director> directors) {
        this.directors = directors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company that = (Company) o;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (publisher != null ? !publisher.equals(that.publisher) : that.publisher != null) return false;
        if (imprintYear != null ? !imprintYear.equals(that.imprintYear) : that.imprintYear != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (imprintYear != null ? imprintYear.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
