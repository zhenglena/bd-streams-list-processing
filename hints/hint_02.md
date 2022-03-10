Remember, a filter only allows elements that match that predicate through to the next stream operation. If you have two
filter operations in a row that is equivalent to putting a `&&` between the predicates. Are your predicates mutually
exclusive? If you want to or predicates, you need to place them in the same filter operation.

The other thing to think about is the order of your map and filter operations. Are you changing the stream in some way
- perhaps capitalized or changing to lowercase? If this happens before your filter, your filter will need to match the
capitalization.