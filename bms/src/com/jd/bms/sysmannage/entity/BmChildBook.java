package com.jd.bms.sysmannage.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @ClassName: BmBook
 * @Description: 少年儿童表
 * @author 浩明
 * @date 2018年5月23日 下午6:48:42
 *
 */
@Entity
@Table(name = "bm_child_book")
public class BmChildBook implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 5424156679774701299L;
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	@Column(name = "book_isbn", length = 32, nullable = false, unique = true)
	private String bookIsbn;
	@Column(name = "book_name", length = 32, nullable = false)
	private String bookName;
	@Column(name = "book_author", length = 32, nullable = false)
	private String bookAuthor;
	@Column(name = "book_repertory", length = 32, nullable = false)
	private Integer bookRepertory;
	@Column(name = "book_price", length = 32, nullable = false)
	private BigDecimal bookPrice;
	@Column(name = "book_time", nullable = false)
	private Date bookTime;
	@Column(name = "book_press", length = 32, nullable = false)
	private String bookPress;
	@Column(name = "book_addres", length = 32, nullable = false)
	private String bookAddres;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Integer getBookRepertory() {
		return bookRepertory;
	}

	public void setBookRepertory(Integer bookRepertory) {
		this.bookRepertory = bookRepertory;
	}

	public BigDecimal getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(BigDecimal bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Date getBookTime() {
		return bookTime;
	}

	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}

	public String getBookPress() {
		return bookPress;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}

	public String getBookAddres() {
		return bookAddres;
	}

	public void setBookAddres(String bookAddres) {
		this.bookAddres = bookAddres;
	}

	@Override
	public String toString() {
		return "BmBook [bookId=" + bookId + ", bookIsbn=" + bookIsbn
				+ ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookRepertory=" + bookRepertory + ", bookPrice="
				+ bookPrice + ", bookTime=" + bookTime + ", bookPress="
				+ bookPress + ", bookAddres=" + bookAddres + "]";
	}

	public BmChildBook(Integer bookId, String bookIsbn, String bookName,
			String bookAuthor, Integer bookRepertory, BigDecimal bookPrice,
			Date bookTime, String bookPress, String bookAddres) {
		super();
		this.bookId = bookId;
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookRepertory = bookRepertory;
		this.bookPrice = bookPrice;
		this.bookTime = bookTime;
		this.bookPress = bookPress;
		this.bookAddres = bookAddres;
	}

	public BmChildBook() {
		super();
		// TODO Auto-generated constructor stub
	}

}
