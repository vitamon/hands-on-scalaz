class SequenceSpec extends org.specs2.mutable.Specification {
  "[vanilla] transform a Seq[Option] in Option[Seq]" >> {
    "should return Some when the seq contains only Some" >> {
      Sequence.vanilla.sequence(Seq(Some(1), Some(2))) must_== Some(Seq(1, 2))
    }
    "should return None when the seq contains Some and None" >> {
      Sequence.vanilla.sequence(Seq(Some(1), None)) must_== None
    }
    "should return None when the seq contains only None" >> {
      Sequence.vanilla.sequence(Seq(None, None)) must_== None
    }
  }
  "[vanilla] transform a Seq[Either] in Either[Seq]" >> {
    "should return Some when the seq contains only Some" >> {
      Sequence.vanilla.sequenceEither(Seq(Right(1), Right(2))) must_== Right(Seq(1, 2))
    }
    "should return None when the seq contains Some and None" >> {
      Sequence.vanilla.sequenceEither(Seq(Right(1), Left("error"))) must_== Left("error")
    }
    "should return None when the seq contains only None" >> {
      Sequence.vanilla.sequenceEither(Seq(Left("error"), Left("error"))) must_== Left("error")
    }
  }
  "[scalaz] transform a Seq[Option] in Option[Seq]" >> {
    "should return Some when the seq contains only Some" >> {
      Sequence.scalaz.sequence(Seq(Some(1), Some(2))) must_== Some(List(1, 2))
    }
    "should return None when the seq contains Some and None" >> {
      Sequence.scalaz.sequence(Seq(Some(1), None)) must_== None
    }
    "should return None when the seq contains only None" >> {
      Sequence.scalaz.sequence(Seq(None, None)) must_== None
    }
  }
  "[scalaz] transform a Seq[Either] in Either[Seq]" >> {
    "should return Some when the seq contains only Some" >> {
      Sequence.scalaz.sequenceEither(Seq(Right(1), Right(2))) must_== Right(List(1, 2))
    }
    "should return None when the seq contains Some and None" >> {
      Sequence.scalaz.sequenceEither(Seq(Right(1), Left("error"))) must_== Left("error")
    }
    "should return None when the seq contains only None" >> {
      Sequence.scalaz.sequenceEither(Seq(Left("error"), Left("error"))) must_== Left("error")
    }
  }
  "[cats] transform a Seq[Option] in Option[Seq]" >> {
    "should return Some when the seq contains only Some" >> {
      Sequence.cats.sequence(Seq(Some(1), Some(2))) must_== Some(List(1, 2))
    }
    "should return None when the seq contains Some and None" >> {
      Sequence.cats.sequence(Seq(Some(1), None)) must_== None
    }
    "should return None when the seq contains only None" >> {
      Sequence.cats.sequence(Seq(None, None)) must_== None
    }
  }
  "[cats] transform a Seq[Either] in Either[Seq]" >> {
    "should return Some when the seq contains only Some" >> {
      Sequence.cats.sequenceEither(Seq(Right(1), Right(2))) must_== Right(List(1, 2))
    }
    "should return None when the seq contains Some and None" >> {
      Sequence.cats.sequenceEither(Seq(Right(1), Left("error"))) must_== Left("error")
    }
    "should return None when the seq contains only None" >> {
      Sequence.cats.sequenceEither(Seq(Left("error"), Left("error"))) must_== Left("error")
    }
  }
}
