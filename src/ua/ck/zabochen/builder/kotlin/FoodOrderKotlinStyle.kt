package ua.ck.zabochen.builder.kotlin

class FoodOrderKotlinStyle private constructor(
        private val bread: String?,
        private val meat: String?) {

    class Builder(
            private var bread: String? = null,
            private var meat: String? = null) {

        fun setBread(bread: String): Builder {
            this.bread = bread
            return this@Builder
        }

        fun setMeat(meat: String): Builder {
            return apply { this.meat = meat }
        }

        fun build(): FoodOrderKotlinStyle {
            return FoodOrderKotlinStyle(bread, meat)
        }
    }

    override fun toString(): String {
        return "Food Order - KotlinStyle: bread = $bread, meat = $meat"
    }
}