package org.spring.springboot.domain;

/**
 * 城市实体类
 *
 * Created by bysocket on 07/02/2017.
 */
public class City {

	/**
	 * 城市编号
	 */
	private Long id;

	/**
	 * 省份编号
	 */
	private Long provinceId;

	/**
	 * 城市名称
	 */
	private String cityName;

	/**
	 * 描述
	 */
	private String description;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		City city = (City)obj;
		if (id != null ? !id.equals(city.id) : city.id != null) {
			return false;
		}
		if (provinceId != null ? !provinceId.equals(city.provinceId) : city.provinceId != null) {
			return false;
		}
		if (cityName != null ? !cityName.equals(city.cityName) : city.cityName != null) {
			return false;
		}
		return description != null ? description.equals(city.description) : city.description == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
		result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		return result;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
