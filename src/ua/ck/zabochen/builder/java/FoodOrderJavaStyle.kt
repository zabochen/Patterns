package ua.ck.zabochen.builder.java

class FoodOrderJavaStyle private constructor(builder: FoodOrderJavaStyle.Builder) {

    private var bread: String? = null
    private var meat: String? = null

    init {
        this.bread = builder.bread
        this.meat = builder.meat
    }

    class Builder {
        var bread: String? = null
            private set
        var meat: String? = null
            private set

        fun setBread(bread: String): Builder {
            this.bread = bread
            return this@Builder
        }

        fun setMeat(meat: String): Builder {
            return apply { this.meat = meat }
        }

        fun build() = FoodOrderJavaStyle(this)
    }

    override fun toString(): String {
        return "Food Order - JavaStyle: bread = $bread, meat = $meat"
    }
}