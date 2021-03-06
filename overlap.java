Function xOverlapCheck(black, blue)
{
    // black left side overlaps.
    if ((black.topLeft.x <= blue.bottomRight.x) &&
        (black.topLeft.x >= blue.topLeft.x))
    {
        return true;
    }

    // black right side overlaps.
    if ((black.bottomRight.x <= blue.bottomRight.x) &&
        (black.bottomRight.x >= blue.topLeft.x))
    {
        return true;
    }

    // black fully contains blue.
    if ((black.bottomRight.x >= blue.bottomRight.x) &&
        (black.topLeft.x <= blue.topLeft.x))
    {
        return true;
    }
}


Function yOverlapCheck(black, blue)
{
    // black top side overlaps.
    if ((black.topLeft.y >= blue.topLeft.y) &&
        (black.topLeft.y <= blue.bottomRight.y))
    {
        return true;
    }

    // black bottom side overlaps.
    if ((black.bottomRight.y >= blue.topLeft.y) &&
        (black.bottomRight.y <= blue.bottomRight.y))
    {
        return true;
    }

    // black fully contains blue.
    if ((black.bottomRight.y >= blue.bottomRight.y) &&
        (black.topLeft.y <= blue.topLeft.y))
    {
        return true;
    }
}