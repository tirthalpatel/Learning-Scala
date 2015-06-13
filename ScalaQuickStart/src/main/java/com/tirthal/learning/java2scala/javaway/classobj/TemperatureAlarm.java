package com.tirthal.learning.java2scala.javaway.classobj;


/**
 * This is a roughly equivalent class in Java would look something like a single line of case class in Scala 
 * @see <a href="https://github.com/tirthalpatel/Learning-Scala/blob/master/ScalaQuickStart/src/main/scala/com/tirthal/learning/java2scala/scalaway/classobj/TemperatureAlarm.scala">TemperatureAlarm - Scala's Case Class</a>
 */
public class TemperatureAlarm {
	private final double temp;

	// Developer needs to write all below code in Java (most times just as part of language formalities)
	
	public TemperatureAlarm(double temp) {
		this.temp = temp;
	}

	public double getTemp() {
		return temp;
	}

	@Override
	public String toString() {
		return "TemperatureAlarm [temp=" + temp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.temp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemperatureAlarm other = (TemperatureAlarm) obj;
		if (Double.doubleToLongBits(temp) != Double.doubleToLongBits(other.temp))
			return false;
		return true;
	}
}
